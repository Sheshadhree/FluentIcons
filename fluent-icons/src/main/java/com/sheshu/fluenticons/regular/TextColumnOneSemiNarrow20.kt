package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextColumnOneSemiNarrow20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextColumnOneSemiNarrow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 5f)
            curveTo(6.224f, 5f, 6f, 5.224f, 6f, 5.5f)
            reflectiveCurveTo(6.224f, 6f, 6.5f, 6f)
            horizontalLineToRelative(7f)
            curveTo(13.776f, 6f, 14f, 5.776f, 14f, 5.5f)
            reflectiveCurveTo(13.776f, 5f, 13.5f, 5f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(0f, 3f)
            curveTo(6.224f, 8f, 6f, 8.224f, 6f, 8.5f)
            reflectiveCurveTo(6.224f, 9f, 6.5f, 9f)
            horizontalLineToRelative(7f)
            curveTo(13.776f, 9f, 14f, 8.776f, 14f, 8.5f)
            reflectiveCurveTo(13.776f, 8f, 13.5f, 8f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(6f, 11.5f)
            curveTo(6f, 11.224f, 6.224f, 11f, 6.5f, 11f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(13.776f, 12f, 13.5f, 12f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 12f, 6f, 11.776f, 6f, 11.5f)
            close()
            moveTo(6.5f, 14f)
            curveTo(6.224f, 14f, 6f, 14.224f, 6f, 14.5f)
            reflectiveCurveTo(6.224f, 15f, 6.5f, 15f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 14f, 13.5f, 14f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
