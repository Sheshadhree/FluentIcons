package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Image24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Image24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.558f, 13.647f)
            lineToRelative(-0.083f, 0.07f)
            lineToRelative(-6.928f, 6.802f)
            curveTo(5.042f, 20.824f, 5.626f, 21f, 6.25f, 21f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.625f, 0f, 1.208f, -0.176f, 1.703f, -0.481f)
            lineToRelative(-6.928f, -6.801f)
            lineToRelative(-0.093f, -0.078f)
            curveToRelative(-0.261f, -0.185f, -0.615f, -0.182f, -0.874f, 0.007f)
            close()
            moveTo(21f, 6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 0.627f, 0.178f, 1.213f, 0.485f, 1.71f)
            lineToRelative(6.939f, -6.813f)
            lineToRelative(0.135f, -0.122f)
            curveToRelative(0.835f, -0.698f, 2.056f, -0.696f, 2.889f, 0.006f)
            lineToRelative(0.128f, 0.117f)
            lineToRelative(6.939f, 6.811f)
            curveTo(20.822f, 18.963f, 21f, 18.377f, 21f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(-5.75f, 4.5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            close()
        }
    }.build()
}
