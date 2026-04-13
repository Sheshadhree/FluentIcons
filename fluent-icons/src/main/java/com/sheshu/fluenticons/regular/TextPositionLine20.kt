package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextPositionLine20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextPositionLine20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            reflectiveCurveTo(3.224f, 4f, 3.5f, 4f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 4f, 17f, 3.776f, 17f, 3.5f)
            reflectiveCurveTo(16.776f, 3f, 16.5f, 3f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(0f, 12f)
            curveTo(3.224f, 15f, 3f, 15.224f, 3f, 15.5f)
            reflectiveCurveTo(3.224f, 16f, 3.5f, 16f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(16.776f, 15f, 16.5f, 15f)
            horizontalLineToRelative(-13f)
            close()
            moveToRelative(7.5f, -2.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(16.776f, 13f, 16.5f, 13f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
            moveToRelative(-7f, -4f)
            curveTo(4f, 7.12f, 5.12f, 6f, 6.5f, 6f)
            reflectiveCurveTo(9f, 7.12f, 9f, 8.5f)
            verticalLineToRelative(5f)
            curveTo(9f, 13.776f, 9.224f, 14f, 9.5f, 14f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 6.567f, 8.433f, 5f, 6.5f, 5f)
            reflectiveCurveTo(3f, 6.567f, 3f, 8.5f)
            verticalLineToRelative(5f)
            curveTo(3f, 13.776f, 3.224f, 14f, 3.5f, 14f)
            reflectiveCurveTo(4f, 13.776f, 4f, 13.5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
