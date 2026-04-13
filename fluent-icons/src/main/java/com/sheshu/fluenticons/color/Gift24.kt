package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Gift24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Gift24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFBB45EA),
                    0.347899f to Color(0xFF8B57ED),
                    1f to Color(0xFF5B2AB5)
                ),
                start = Offset(10.9796f, 25.7331f),
                end = Offset(10.9796f, 8.79988f)
            )
        ) {
            moveTo(20f, 12.5f)
            verticalLineToRelative(6.25f)
            curveToRelative(0f, 1.733f, -1.357f, 3.15f, -3.066f, 3.245f)
            lineTo(16.75f, 22f)
            horizontalLineToRelative(-9.5f)
            curveToRelative(-1.733f, 0f, -3.15f, -1.357f, -3.245f, -3.066f)
            lineTo(4f, 18.75f)
            verticalLineTo(12.5f)
            horizontalLineToRelative(16f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0.196406f to Color(0xFF5B2AB5),
                    0.762565f to Color(0xFF8B57ED),
                    1f to Color(0xFFBB45EA)
                ),
                center = Offset(12f, 4.75937f),
                radius = 23.183f
            )
        ) {
            moveTo(19.75f, 7f)
            curveTo(20.44f, 7f, 21f, 7.56f, 21f, 8.25f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.604f, -0.429f, 1.109f, -1f, 1.225f)
            horizontalLineTo(4f)
            curveToRelative(-0.57f, -0.116f, -1f, -0.62f, -1f, -1.225f)
            verticalLineToRelative(-3.5f)
            curveTo(3f, 7.56f, 3.56f, 7f, 4.25f, 7f)
            horizontalLineToRelative(15.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(11.25f, 6.375f),
                end = Offset(11.25f, 20.2609f)
            )
        ) {
            moveTo(11.25f, 22f)
            verticalLineTo(12f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(-1.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFB5937),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(11.25f, -13.4286f),
                end = Offset(11.25f, 21.5714f)
            )
        ) {
            moveTo(11.25f, 13f)
            verticalLineTo(8f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-1.5f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.5f, 8.5f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            reflectiveCurveTo(7.705f, 2f, 9.5f, 2f)
            curveToRelative(1.005f, 0f, 1.904f, 0.456f, 2.5f, 1.173f)
            curveTo(12.596f, 2.456f, 13.495f, 2f, 14.5f, 2f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            reflectiveCurveTo(16.295f, 8.5f, 14.5f, 8.5f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(7.75f, 5.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(7f)
            horizontalLineTo(9.5f)
            curveTo(8.534f, 7f, 7.75f, 6.216f, 7.75f, 5.25f)
            close()
            moveToRelative(5f, 1.75f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(15.466f, 3.5f, 14.5f, 3.5f)
            reflectiveCurveToRelative(-1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineTo(7f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF6F47),
                    1f to Color(0xFFFFCD0F)
                ),
                start = Offset(15.1944f, 8.49838f),
                end = Offset(11.9054f, -4.9006f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.5f, 8.5f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            reflectiveCurveTo(7.705f, 2f, 9.5f, 2f)
            curveToRelative(1.005f, 0f, 1.904f, 0.456f, 2.5f, 1.173f)
            curveTo(12.596f, 2.456f, 13.495f, 2f, 14.5f, 2f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            reflectiveCurveTo(16.295f, 8.5f, 14.5f, 8.5f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(7.75f, 5.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(7f)
            horizontalLineTo(9.5f)
            curveTo(8.534f, 7f, 7.75f, 6.216f, 7.75f, 5.25f)
            close()
            moveToRelative(5f, 1.75f)
            horizontalLineToRelative(1.75f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(15.466f, 3.5f, 14.5f, 3.5f)
            reflectiveCurveToRelative(-1.75f, 0.784f, -1.75f, 1.75f)
            verticalLineTo(7f)
            close()
        }
    }.build()
}
