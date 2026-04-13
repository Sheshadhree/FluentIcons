package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextBulletList16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextBulletList16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveTo(2f, 9f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(2.552f, 7f, 2f, 7f)
            reflectiveCurveTo(1f, 7.448f, 1f, 8f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveToRelative(1f, 3.5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveTo(5.5f, 3f)
            curveTo(5.224f, 3f, 5f, 3.224f, 5f, 3.5f)
            reflectiveCurveTo(5.224f, 4f, 5.5f, 4f)
            horizontalLineToRelative(9f)
            curveTo(14.776f, 4f, 15f, 3.776f, 15f, 3.5f)
            reflectiveCurveTo(14.776f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(5f, 8f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(9f)
            curveTo(14.776f, 7.5f, 15f, 7.724f, 15f, 8f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-9f)
            curveTo(5.224f, 8.5f, 5f, 8.276f, 5f, 8f)
            close()
            moveToRelative(0.5f, 4f)
            curveTo(5.224f, 12f, 5f, 12.224f, 5f, 12.5f)
            reflectiveCurveTo(5.224f, 13f, 5.5f, 13f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 12f, 14.5f, 12f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
