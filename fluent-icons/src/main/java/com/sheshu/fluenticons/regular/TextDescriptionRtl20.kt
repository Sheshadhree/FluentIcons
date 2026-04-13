package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextDescriptionRtl20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextDescriptionRtl20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.5f, 5f)
            curveTo(17.776f, 5f, 18f, 5.224f, 18f, 5.5f)
            reflectiveCurveTo(17.776f, 6f, 17.5f, 6f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 6f, 2f, 5.776f, 2f, 5.5f)
            reflectiveCurveTo(2.224f, 5f, 2.5f, 5f)
            horizontalLineToRelative(15f)
            close()
            moveToRelative(0f, 3f)
            curveTo(17.776f, 8f, 18f, 8.224f, 18f, 8.5f)
            reflectiveCurveTo(17.776f, 9f, 17.5f, 9f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 9f, 2f, 8.776f, 2f, 8.5f)
            reflectiveCurveTo(2.224f, 8f, 2.5f, 8f)
            horizontalLineToRelative(15f)
            close()
            moveToRelative(0.5f, 3.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 11f, 2f, 11.224f, 2f, 11.5f)
            reflectiveCurveTo(2.224f, 12f, 2.5f, 12f)
            horizontalLineToRelative(15f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            close()
            moveTo(17.5f, 14f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 15f, 17.5f, 15f)
            horizontalLineToRelative(-10f)
            curveTo(7.224f, 15f, 7f, 14.776f, 7f, 14.5f)
            reflectiveCurveTo(7.224f, 14f, 7.5f, 14f)
            horizontalLineToRelative(10f)
            close()
        }
    }.build()
}
