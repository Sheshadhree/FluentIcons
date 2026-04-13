package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextPositionTopBottom20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextPositionTopBottom20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 3.5f)
            curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 3f, 17f, 3.224f, 17f, 3.5f)
            reflectiveCurveTo(16.776f, 4f, 16.5f, 4f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 4f, 3f, 3.776f, 3f, 3.5f)
            close()
            moveToRelative(0f, 12f)
            curveTo(3f, 15.224f, 3.224f, 15f, 3.5f, 15f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(16.776f, 16f, 16.5f, 16f)
            horizontalLineToRelative(-13f)
            curveTo(3.224f, 16f, 3f, 15.776f, 3f, 15.5f)
            close()
            moveToRelative(4.5f, -7f)
            curveTo(7.5f, 7.12f, 8.62f, 6f, 10f, 6f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(13.5f, 6.567f, 11.933f, 5f, 10f, 5f)
            reflectiveCurveTo(6.5f, 6.567f, 6.5f, 8.5f)
            verticalLineToRelative(5f)
            curveTo(6.5f, 13.776f, 6.724f, 14f, 7f, 14f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
