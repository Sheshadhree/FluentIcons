package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Link32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Link32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(-7f, 2.65625f),
                end = Offset(4.82775f, 36.9989f)
            )
        ) {
            moveTo(2f, 16.25f)
            curveTo(2f, 12.246f, 5.246f, 9f, 9.25f, 9f)
            horizontalLineToRelative(3.5f)
            curveTo(13.44f, 9f, 14f, 9.56f, 14f, 10.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-2.623f, 0f, -4.75f, 2.127f, -4.75f, 4.75f)
            reflectiveCurveTo(6.627f, 21f, 9.25f, 21f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-3.5f)
            curveTo(5.246f, 23.5f, 2f, 20.254f, 2f, 16.25f)
            close()
            moveToRelative(28f, 0f)
            curveTo(30f, 12.246f, 26.754f, 9f, 22.75f, 9f)
            horizontalLineToRelative(-3.5f)
            curveTo(18.56f, 9f, 18f, 9.56f, 18f, 10.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(3.5f)
            curveToRelative(2.623f, 0f, 4.75f, 2.127f, 4.75f, 4.75f)
            reflectiveCurveTo(25.373f, 21f, 22.75f, 21f)
            horizontalLineToRelative(-3.5f)
            curveTo(18.56f, 21f, 18f, 21.56f, 18f, 22.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(3.5f)
            curveToRelative(4.004f, 0f, 7.25f, -3.246f, 7.25f, -7.25f)
            close()
            moveTo(9.75f, 15f)
            curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(22.94f, 15f, 22.25f, 15f)
            horizontalLineTo(9.75f)
            close()
        }
    }.build()
}
