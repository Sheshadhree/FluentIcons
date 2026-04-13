package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.TextBulletListSquare20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.TextBulletListSquare20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(3.5f, 5.625f),
                end = Offset(13.1617f, 15.6631f)
            )
        ) {
            moveTo(5.75f, 3f)
            horizontalLineToRelative(8.5f)
            curveTo(15.769f, 3f, 17f, 4.231f, 17f, 5.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(4.231f, 17f, 3f, 15.769f, 3f, 14.25f)
            verticalLineToRelative(-8.5f)
            curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color.White,
                    1f to Color(0xFFB3E0FF)
                ),
                start = Offset(7.53846f, 7.07692f),
                end = Offset(12.7972f, 20.6673f)
            )
        ) {
            moveTo(6.75f, 8f)
            curveTo(7.164f, 8f, 7.5f, 7.664f, 7.5f, 7.25f)
            reflectiveCurveTo(7.164f, 6.5f, 6.75f, 6.5f)
            reflectiveCurveTo(6f, 6.836f, 6f, 7.25f)
            reflectiveCurveTo(6.336f, 8f, 6.75f, 8f)
            close()
            moveToRelative(0.75f, 2.25f)
            curveTo(7.5f, 10.664f, 7.164f, 11f, 6.75f, 11f)
            reflectiveCurveTo(6f, 10.664f, 6f, 10.25f)
            reflectiveCurveTo(6.336f, 9.5f, 6.75f, 9.5f)
            reflectiveCurveTo(7.5f, 9.836f, 7.5f, 10.25f)
            close()
            moveTo(6.75f, 14f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(7.164f, 12.5f, 6.75f, 12.5f)
            reflectiveCurveTo(6f, 12.836f, 6f, 13.25f)
            reflectiveCurveTo(6.336f, 14f, 6.75f, 14f)
            close()
            moveTo(9f, 7.5f)
            curveTo(9f, 7.224f, 9.224f, 7f, 9.5f, 7f)
            horizontalLineToRelative(4f)
            curveTo(13.776f, 7f, 14f, 7.224f, 14f, 7.5f)
            reflectiveCurveTo(13.776f, 8f, 13.5f, 8f)
            horizontalLineToRelative(-4f)
            curveTo(9.224f, 8f, 9f, 7.776f, 9f, 7.5f)
            close()
            moveTo(9.5f, 10f)
            curveTo(9.224f, 10f, 9f, 10.224f, 9f, 10.5f)
            reflectiveCurveTo(9.224f, 11f, 9.5f, 11f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 10f, 13.5f, 10f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(9f, 13.5f)
            curveTo(9f, 13.224f, 9.224f, 13f, 9.5f, 13f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 14f, 13.5f, 14f)
            horizontalLineToRelative(-4f)
            curveTo(9.224f, 14f, 9f, 13.776f, 9f, 13.5f)
            close()
        }
    }.build()
}
