package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.History32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.History32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD373FC),
                    1f to Color(0xFF6D37CD)
                ),
                start = Offset(13.2344f, 26.1295f),
                end = Offset(31.4228f, 18.8601f)
            )
        ) {
            moveTo(15.75f, 8f)
            curveTo(16.44f, 8f, 17f, 8.56f, 17f, 9.25f)
            verticalLineTo(15f)
            horizontalLineToRelative(3.75f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineToRelative(-7f)
            curveTo(14.5f, 8.56f, 15.06f, 8f, 15.75f, 8f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(3f, 4.52941f),
                end = Offset(9.97856f, 33.7498f)
            )
        ) {
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
        }
    }.build()
}
