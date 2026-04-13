package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Shifts24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Shifts24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1EC8B0),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(6f, 2f),
                end = Offset(15f, 22f)
            )
        ) {
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(11.5f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFDEDEFF)
                ),
                start = Offset(10.9063f, 6.5625f),
                end = Offset(8.69397f, 13.9881f)
            )
        ) {
            moveTo(11.75f, 6f)
            curveTo(11.336f, 6f, 11f, 6.336f, 11f, 6.75f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(4.498f)
            curveToRelative(0.415f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(16.663f, 12f, 16.248f, 12f)
            horizontalLineTo(12.5f)
            verticalLineTo(6.75f)
            curveTo(12.5f, 6.336f, 12.164f, 6f, 11.75f, 6f)
            close()
        }
    }.build()
}
