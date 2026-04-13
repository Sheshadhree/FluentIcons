package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.History32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.History32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 5.5f)
            curveToRelative(5.799f, 0f, 10.5f, 4.701f, 10.5f, 10.5f)
            reflectiveCurveTo(21.799f, 26.5f, 16f, 26.5f)
            reflectiveCurveTo(5.5f, 21.799f, 5.5f, 16f)
            curveToRelative(0f, -0.226f, 0.007f, -0.451f, 0.021f, -0.674f)
            curveToRelative(0.044f, -0.689f, -0.48f, -1.282f, -1.168f, -1.326f)
            curveToRelative(-0.69f, -0.043f, -1.283f, 0.48f, -1.327f, 1.169f)
            curveTo(3.01f, 15.444f, 3f, 15.72f, 3f, 16f)
            curveToRelative(0f, 7.18f, 5.82f, 13f, 13f, 13f)
            reflectiveCurveToRelative(13f, -5.82f, 13f, -13f)
            reflectiveCurveTo(23.18f, 3f, 16f, 3f)
            curveToRelative(-3.25f, 0f, -6.222f, 1.194f, -8.5f, 3.164f)
            verticalLineTo(4.25f)
            curveTo(7.5f, 3.56f, 6.94f, 3f, 6.25f, 3f)
            reflectiveCurveTo(5f, 3.56f, 5f, 4.25f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(11.94f, 8f, 11.25f, 8f)
            horizontalLineTo(9.199f)
            curveTo(11.032f, 6.44f, 13.406f, 5.5f, 16f, 5.5f)
            close()
            moveToRelative(1f, 3.75f)
            curveTo(17f, 8.56f, 16.44f, 8f, 15.75f, 8f)
            reflectiveCurveTo(14.5f, 8.56f, 14.5f, 9.25f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(21.44f, 15f, 20.75f, 15f)
            horizontalLineTo(17f)
            verticalLineTo(9.25f)
            close()
        }
    }.build()
}
