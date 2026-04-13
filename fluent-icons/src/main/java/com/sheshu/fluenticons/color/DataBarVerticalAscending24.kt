package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.DataBarVerticalAscending24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.DataBarVerticalAscending24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF16BBDA),
                    1f to Color(0xFF0067BF)
                ),
                start = Offset(19.9083f, -2.52901f),
                end = Offset(31.9938f, 3.11223f)
            )
        ) {
            moveTo(20.5f, 5.25f)
            curveTo(20.5f, 4.007f, 19.493f, 3f, 18.25f, 3f)
            reflectiveCurveTo(16f, 4.007f, 16f, 5.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            reflectiveCurveToRelative(2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(5.25f)
            close()
            moveToRelative(-6.5f, 4f)
            curveTo(14f, 8.007f, 12.993f, 7f, 11.75f, 7f)
            reflectiveCurveTo(9.5f, 8.007f, 9.5f, 9.25f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            reflectiveCurveTo(14f, 19.993f, 14f, 18.75f)
            verticalLineToRelative(-9.5f)
            close()
            moveToRelative(-6.5f, 4f)
            curveTo(7.5f, 12.007f, 6.493f, 11f, 5.25f, 11f)
            reflectiveCurveTo(3f, 12.007f, 3f, 13.25f)
            verticalLineToRelative(5.5f)
            curveTo(3f, 19.993f, 4.007f, 21f, 5.25f, 21f)
            reflectiveCurveToRelative(2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-5.5f)
            close()
        }
    }.build()
}
