package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Shifts28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Shifts28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(15.5f)
            curveTo(3f, 23.545f, 4.455f, 25f, 6.25f, 25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(25f, 4.455f, 23.545f, 3f, 21.75f, 3f)
            horizontalLineTo(6.25f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(6.66667f, 1.77778f),
                end = Offset(17.6667f, 26.2222f)
            )
        ) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(15.5f)
            curveTo(3f, 23.545f, 4.455f, 25f, 6.25f, 25f)
            horizontalLineToRelative(15.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(25f, 4.455f, 23.545f, 3f, 21.75f, 3f)
            horizontalLineTo(6.25f)
            close()
        }
        path(fill = SolidColor(Color(0xFFD9D9D9))) {
            moveTo(14.5f, 7.75f)
            curveTo(14.5f, 7.336f, 14.164f, 7f, 13.75f, 7f)
            reflectiveCurveTo(13f, 7.336f, 13f, 7.75f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(19.664f, 14f, 19.25f, 14f)
            horizontalLineTo(14.5f)
            verticalLineTo(7.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFDEDEFF)
                ),
                start = Offset(12.8906f, 7.6375f),
                end = Offset(10.4444f, 16.0924f)
            )
        ) {
            moveTo(14.5f, 7.75f)
            curveTo(14.5f, 7.336f, 14.164f, 7f, 13.75f, 7f)
            reflectiveCurveTo(13f, 7.336f, 13f, 7.75f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(19.664f, 14f, 19.25f, 14f)
            horizontalLineTo(14.5f)
            verticalLineTo(7.75f)
            close()
        }
    }.build()
}
