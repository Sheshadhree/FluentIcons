package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.LinkMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.LinkMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.429447f to Color(0xFF367AF2),
                    0.942067f to Color(0xFF5750E2),
                    1f to Color(0xFF6F47DF)
                ),
                center = Offset(1.5f, 3f),
                radius = 11.4018f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(1f, 6.25f)
            curveTo(1f, 4.455f, 2.455f, 3f, 4.25f, 3f)
            horizontalLineToRelative(4.5f)
            curveTo(10.545f, 3f, 12f, 4.455f, 12f, 6.25f)
            reflectiveCurveTo(10.545f, 9.5f, 8.75f, 9.5f)
            horizontalLineToRelative(-4.5f)
            curveTo(2.455f, 9.5f, 1f, 8.045f, 1f, 6.25f)
            close()
            moveTo(4.25f, 4.5f)
            curveTo(3.284f, 4.5f, 2.5f, 5.284f, 2.5f, 6.25f)
            reflectiveCurveTo(3.284f, 8f, 4.25f, 8f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(9.716f, 4.5f, 8.75f, 4.5f)
            horizontalLineToRelative(-4.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.26875f to Color(0x00261D82),
                    0.5f to Color(0xFF261D82),
                    0.55625f to Color(0xFF261D82),
                    0.865625f to Color(0x00261D82)
                ),
                center = Offset(7.5f, 10f),
                radius = 5f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(1f, 6.25f)
            curveTo(1f, 4.455f, 2.455f, 3f, 4.25f, 3f)
            horizontalLineToRelative(4.5f)
            curveTo(10.545f, 3f, 12f, 4.455f, 12f, 6.25f)
            reflectiveCurveTo(10.545f, 9.5f, 8.75f, 9.5f)
            horizontalLineToRelative(-4.5f)
            curveTo(2.455f, 9.5f, 1f, 8.045f, 1f, 6.25f)
            close()
            moveTo(4.25f, 4.5f)
            curveTo(3.284f, 4.5f, 2.5f, 5.284f, 2.5f, 6.25f)
            reflectiveCurveTo(3.284f, 8f, 4.25f, 8f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(9.716f, 4.5f, 8.75f, 4.5f)
            horizontalLineToRelative(-4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x005157E4),
                    0.066311f to Color(0xFF5157E4),
                    0.326595f to Color(0xFF5157E4),
                    0.603575f to Color(0x005157E4)
                ),
                start = Offset(12f, 8f),
                end = Offset(6.36477f, 3.5786f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(1f, 6.25f)
            curveTo(1f, 4.455f, 2.455f, 3f, 4.25f, 3f)
            horizontalLineToRelative(4.5f)
            curveTo(10.545f, 3f, 12f, 4.455f, 12f, 6.25f)
            reflectiveCurveTo(10.545f, 9.5f, 8.75f, 9.5f)
            horizontalLineToRelative(-4.5f)
            curveTo(2.455f, 9.5f, 1f, 8.045f, 1f, 6.25f)
            close()
            moveTo(4.25f, 4.5f)
            curveTo(3.284f, 4.5f, 2.5f, 5.284f, 2.5f, 6.25f)
            reflectiveCurveTo(3.284f, 8f, 4.25f, 8f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(9.716f, 4.5f, 8.75f, 4.5f)
            horizontalLineToRelative(-4.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF36DFF1),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(0.464285f, 3.65625f),
                end = Offset(6.32658f, 18.5735f)
            )
        ) {
            moveTo(10.482f, 6.5f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 6.5f, 4f, 7.955f, 4f, 9.75f)
            reflectiveCurveTo(5.455f, 13f, 7.25f, 13f)
            horizontalLineToRelative(4.5f)
            curveTo(13.545f, 13f, 15f, 11.545f, 15f, 9.75f)
            curveToRelative(0f, -1.714f, -1.327f, -3.119f, -3.01f, -3.241f)
            curveToRelative(-0.043f, 0.546f, -0.221f, 1.054f, -0.5f, 1.491f)
            horizontalLineToRelative(0.26f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveToRelative(-0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            curveToRelative(0f, -0.882f, 0.652f, -1.611f, 1.5f, -1.732f)
            verticalLineTo(8f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.882f, 0f, 1.611f, -0.652f, 1.732f, -1.5f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.260417f to Color(0x002764E7),
                    0.447917f to Color(0xFF2764E7),
                    0.578125f to Color(0xFF2764E7),
                    0.767361f to Color(0x002764E7)
                ),
                center = Offset(9f, 6f),
                radius = 4.5f
            )
        ) {
            moveTo(10.482f, 6.5f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 6.5f, 4f, 7.955f, 4f, 9.75f)
            reflectiveCurveTo(5.455f, 13f, 7.25f, 13f)
            horizontalLineToRelative(4.5f)
            curveTo(13.545f, 13f, 15f, 11.545f, 15f, 9.75f)
            curveToRelative(0f, -1.714f, -1.327f, -3.119f, -3.01f, -3.241f)
            curveToRelative(-0.043f, 0.546f, -0.221f, 1.054f, -0.5f, 1.491f)
            horizontalLineToRelative(0.26f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveToRelative(-0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            curveToRelative(0f, -0.882f, 0.652f, -1.611f, 1.5f, -1.732f)
            verticalLineTo(8f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.882f, 0f, 1.611f, -0.652f, 1.732f, -1.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x3D31B3EE),
                    0.207974f to Color(0xFF31B3EE),
                    0.538814f to Color(0xFF31B3EE),
                    0.755175f to Color(0xE631B3EE),
                    1f to Color(0x0031B3EE)
                ),
                start = Offset(4f, 5f),
                end = Offset(9.52664f, 7.95009f)
            )
        ) {
            moveTo(10.482f, 6.5f)
            horizontalLineTo(7.25f)
            curveTo(5.455f, 6.5f, 4f, 7.955f, 4f, 9.75f)
            reflectiveCurveTo(5.455f, 13f, 7.25f, 13f)
            horizontalLineToRelative(4.5f)
            curveTo(13.545f, 13f, 15f, 11.545f, 15f, 9.75f)
            curveToRelative(0f, -1.714f, -1.327f, -3.119f, -3.01f, -3.241f)
            curveToRelative(-0.043f, 0.546f, -0.221f, 1.054f, -0.5f, 1.491f)
            horizontalLineToRelative(0.26f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveToRelative(-0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            curveToRelative(0f, -0.882f, 0.652f, -1.611f, 1.5f, -1.732f)
            verticalLineTo(8f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.882f, 0f, 1.611f, -0.652f, 1.732f, -1.5f)
            close()
        }
    }.build()
}
