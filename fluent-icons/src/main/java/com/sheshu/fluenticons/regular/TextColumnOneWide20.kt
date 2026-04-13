package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextColumnOneWide20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextColumnOneWide20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 5f)
            curveTo(3.224f, 5f, 3f, 5.224f, 3f, 5.5f)
            reflectiveCurveTo(3.224f, 6f, 3.5f, 6f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 6f, 17f, 5.776f, 17f, 5.5f)
            reflectiveCurveTo(16.776f, 5f, 16.5f, 5f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(0f, 3f)
            curveTo(3.224f, 8f, 3f, 8.224f, 3f, 8.5f)
            reflectiveCurveTo(3.224f, 9f, 3.5f, 9f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 9f, 17f, 8.776f, 17f, 8.5f)
            reflectiveCurveTo(16.776f, 8f, 16.5f, 8f)
            horizontalLineToRelative(-13f)
            close()
            moveTo(3f, 11.5f)
            curveTo(3f, 11.224f, 3.224f, 11f, 3.5f, 11f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(16.776f, 12f, 16.5f, 12f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 12f, 3f, 11.776f, 3f, 11.5f)
            close()
            moveTo(3.5f, 14f)
            curveTo(3.224f, 14f, 3f, 14.224f, 3f, 14.5f)
            reflectiveCurveTo(3.224f, 15f, 3.5f, 15f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.776f, 14f, 16.5f, 14f)
            horizontalLineToRelative(-13f)
            close()
        }
    }.build()
}
