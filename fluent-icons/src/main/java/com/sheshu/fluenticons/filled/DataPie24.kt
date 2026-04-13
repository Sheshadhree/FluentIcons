package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataPie24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataPie24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.272f, 2.004f)
            curveToRelative(-0.202f, -0.006f, -0.399f, 0.07f, -0.544f, 0.212f)
            curveTo(12.582f, 2.356f, 12.5f, 2.55f, 12.5f, 2.753f)
            verticalLineToRelative(7.996f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(7.996f)
            curveToRelative(0.203f, 0f, 0.397f, -0.082f, 0.538f, -0.228f)
            curveToRelative(0.142f, -0.145f, 0.218f, -0.342f, 0.212f, -0.544f)
            curveToRelative(-0.141f, -4.755f, -3.97f, -8.582f, -8.724f, -8.724f)
            close()
            moveToRelative(-2.516f, 2.207f)
            curveTo(10.911f, 4.353f, 11f, 4.554f, 11f, 4.765f)
            verticalLineToRelative(5.985f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(5.965f)
            curveToRelative(0.21f, 0f, 0.412f, 0.089f, 0.554f, 0.245f)
            curveToRelative(0.142f, 0.155f, 0.212f, 0.364f, 0.193f, 0.574f)
            curveToRelative(-0.424f, 4.578f, -4.274f, 8.162f, -8.962f, 8.162f)
            curveToRelative(-4.97f, 0f, -9f, -4.03f, -9f, -9f)
            curveToRelative(0f, -4.695f, 3.595f, -8.55f, 8.183f, -8.963f)
            curveToRelative(0.21f, -0.02f, 0.418f, 0.05f, 0.573f, 0.193f)
            close()
        }
    }.build()
}
