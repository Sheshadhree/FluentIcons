package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Filter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Filter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 13f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(12.5f, 14f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 14f, 7f, 13.776f, 7f, 13.5f)
            curveToRelative(0f, -0.245f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(7.5f, 13f)
            horizontalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(-2f, -4f)
            horizontalLineToRelative(9f)
            curveTo(14.776f, 9f, 15f, 9.224f, 15f, 9.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(14.5f, 10f)
            horizontalLineToRelative(-9f)
            curveTo(5.224f, 10f, 5f, 9.776f, 5f, 9.5f)
            curveToRelative(0f, -0.245f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(5.5f, 9f)
            horizontalLineToRelative(9f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(-2f, -4f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 5f, 17f, 5.224f, 17f, 5.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(16.5f, 6f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 6f, 3f, 5.776f, 3f, 5.5f)
            curveToRelative(0f, -0.245f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(3.5f, 5f)
            horizontalLineToRelative(13f)
            horizontalLineToRelative(-13f)
            close()
        }
    }.build()
}
