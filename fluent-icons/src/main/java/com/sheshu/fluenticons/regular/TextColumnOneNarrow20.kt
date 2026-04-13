package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextColumnOneNarrow20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextColumnOneNarrow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 5f)
            curveTo(7.224f, 5f, 7f, 5.224f, 7f, 5.5f)
            reflectiveCurveTo(7.224f, 6f, 7.5f, 6f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 6f, 13f, 5.776f, 13f, 5.5f)
            reflectiveCurveTo(12.776f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(0f, 3f)
            curveTo(7.224f, 8f, 7f, 8.224f, 7f, 8.5f)
            reflectiveCurveTo(7.224f, 9f, 7.5f, 9f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 9f, 13f, 8.776f, 13f, 8.5f)
            reflectiveCurveTo(12.776f, 8f, 12.5f, 8f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(7f, 11.5f)
            curveTo(7f, 11.224f, 7.224f, 11f, 7.5f, 11f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 12f, 12.5f, 12f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 12f, 7f, 11.776f, 7f, 11.5f)
            close()
            moveTo(7.5f, 14f)
            curveTo(7.224f, 14f, 7f, 14.224f, 7f, 14.5f)
            reflectiveCurveTo(7.224f, 15f, 7.5f, 15f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 14f, 12.5f, 14f)
            horizontalLineToRelative(-5f)
            close()
        }
    }.build()
}
