package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextDescriptionLtr20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextDescriptionLtr20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 5f)
            curveTo(2.224f, 5f, 2f, 5.224f, 2f, 5.5f)
            reflectiveCurveTo(2.224f, 6f, 2.5f, 6f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 6f, 18f, 5.776f, 18f, 5.5f)
            reflectiveCurveTo(17.776f, 5f, 17.5f, 5f)
            horizontalLineToRelative(-15f)
            close()
            moveToRelative(0f, 3f)
            curveTo(2.224f, 8f, 2f, 8.224f, 2f, 8.5f)
            reflectiveCurveTo(2.224f, 9f, 2.5f, 9f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 9f, 18f, 8.776f, 18f, 8.5f)
            reflectiveCurveTo(17.776f, 8f, 17.5f, 8f)
            horizontalLineToRelative(-15f)
            close()
            moveTo(2f, 11.5f)
            curveTo(2f, 11.224f, 2.224f, 11f, 2.5f, 11f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 12f, 17.5f, 12f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 12f, 2f, 11.776f, 2f, 11.5f)
            close()
            moveTo(2.5f, 14f)
            curveTo(2.224f, 14f, 2f, 14.224f, 2f, 14.5f)
            reflectiveCurveTo(2.224f, 15f, 2.5f, 15f)
            horizontalLineToRelative(10f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 14f, 12.5f, 14f)
            horizontalLineToRelative(-10f)
            close()
        }
    }.build()
}
