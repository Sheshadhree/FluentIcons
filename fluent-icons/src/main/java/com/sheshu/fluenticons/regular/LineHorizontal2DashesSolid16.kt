package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineHorizontal2DashesSolid16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineHorizontal2DashesSolid16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 5f)
            curveTo(2.224f, 5f, 2f, 5.224f, 2f, 5.5f)
            reflectiveCurveTo(2.224f, 6f, 2.5f, 6f)
            horizontalLineToRelative(2f)
            curveTo(4.776f, 6f, 5f, 5.776f, 5f, 5.5f)
            reflectiveCurveTo(4.776f, 5f, 4.5f, 5f)
            horizontalLineToRelative(-2f)
            close()
            moveTo(7f, 5f)
            curveTo(6.724f, 5f, 6.5f, 5.224f, 6.5f, 5.5f)
            reflectiveCurveTo(6.724f, 6f, 7f, 6f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.276f, 5f, 9f, 5f)
            horizontalLineTo(7f)
            close()
            moveToRelative(4.5f, 0f)
            curveTo(11.224f, 5f, 11f, 5.224f, 11f, 5.5f)
            reflectiveCurveTo(11.224f, 6f, 11.5f, 6f)
            horizontalLineToRelative(2f)
            curveTo(13.776f, 6f, 14f, 5.776f, 14f, 5.5f)
            reflectiveCurveTo(13.776f, 5f, 13.5f, 5f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(-9f, 5f)
            curveTo(2.224f, 10f, 2f, 10.224f, 2f, 10.5f)
            reflectiveCurveTo(2.224f, 11f, 2.5f, 11f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 10f, 13.5f, 10f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
