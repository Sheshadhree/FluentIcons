package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NextFrame20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NextFrame20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3f)
            curveTo(4.776f, 3f, 5f, 3.224f, 5f, 3.5f)
            verticalLineToRelative(13f)
            curveTo(5f, 16.776f, 4.776f, 17f, 4.5f, 17f)
            reflectiveCurveTo(4f, 16.776f, 4f, 16.5f)
            verticalLineToRelative(-13f)
            curveTo(4f, 3.224f, 4.224f, 3f, 4.5f, 3f)
            close()
            moveToRelative(5.447f, 0.214f)
            curveTo(9.117f, 2.657f, 8f, 3.252f, 8f, 4.252f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.004f, 1.124f, 1.598f, 1.954f, 1.033f)
            lineToRelative(8.5f, -5.793f)
            curveToRelative(0.73f, -0.498f, 0.727f, -1.577f, -0.008f, -2.07f)
            lineToRelative(-8.5f, -5.708f)
            close()
            moveTo(9f, 4.252f)
            curveToRelative(0f, -0.2f, 0.223f, -0.319f, 0.39f, -0.207f)
            lineToRelative(8.499f, 5.707f)
            curveToRelative(0.146f, 0.098f, 0.147f, 0.314f, 0.001f, 0.414f)
            lineToRelative(-8.5f, 5.793f)
            curveTo(9.226f, 16.072f, 9f, 15.953f, 9f, 15.752f)
            verticalLineToRelative(-11.5f)
            close()
        }
    }.build()
}
