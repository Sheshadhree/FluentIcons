package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextBulletListRtl16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextBulletListRtl16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 4.5f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
            moveTo(14f, 9f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
            moveToRelative(-1f, 3.5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            close()
            moveTo(10.5f, 3f)
            curveTo(10.776f, 3f, 11f, 3.224f, 11f, 3.5f)
            reflectiveCurveTo(10.776f, 4f, 10.5f, 4f)
            horizontalLineToRelative(-9f)
            curveTo(1.224f, 4f, 1f, 3.776f, 1f, 3.5f)
            reflectiveCurveTo(1.224f, 3f, 1.5f, 3f)
            horizontalLineToRelative(9f)
            close()
            moveTo(11f, 8f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-9f)
            curveTo(1.224f, 7.5f, 1f, 7.724f, 1f, 8f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(9f)
            curveTo(10.776f, 8.5f, 11f, 8.276f, 11f, 8f)
            close()
            moveToRelative(-0.5f, 4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.776f, 13f, 10.5f, 13f)
            horizontalLineToRelative(-9f)
            curveTo(1.224f, 13f, 1f, 12.776f, 1f, 12.5f)
            reflectiveCurveTo(1.224f, 12f, 1.5f, 12f)
            horizontalLineToRelative(9f)
            close()
        }
    }.build()
}
