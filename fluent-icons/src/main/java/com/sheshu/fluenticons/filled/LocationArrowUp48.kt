package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationArrowUp48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationArrowUp48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(37f, 32f)
            lineTo(26.912f, 42.71f)
            curveToRelative(-1.58f, 1.676f, -4.244f, 1.676f, -5.824f, 0f)
            lineTo(11f, 32f)
            horizontalLineToRelative(0.038f)
            lineToRelative(-0.017f, -0.02f)
            lineTo(11f, 31.955f)
            curveToRelative(-0.644f, -0.764f, -1.222f, -1.585f, -1.726f, -2.455f)
            curveTo(7.828f, 27f, 7f, 24.096f, 7f, 21f)
            curveToRelative(0f, -9.389f, 7.611f, -17f, 17f, -17f)
            reflectiveCurveToRelative(17f, 7.611f, 17f, 17f)
            curveToRelative(0f, 3.096f, -0.828f, 6f, -2.274f, 8.5f)
            curveToRelative(-0.504f, 0.87f, -1.082f, 1.691f, -1.726f, 2.455f)
            lineToRelative(-0.021f, 0.025f)
            lineTo(36.962f, 32f)
            horizontalLineTo(37f)
            close()
            moveToRelative(-8.884f, -12.116f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-5f, -5f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            lineToRelative(-5f, 5f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(1.28f, 0.488f, 1.768f, 0f)
            lineToRelative(2.866f, -2.866f)
            verticalLineTo(28f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(17.018f)
            lineToRelative(2.866f, 2.866f)
            close()
        }
    }.build()
}
