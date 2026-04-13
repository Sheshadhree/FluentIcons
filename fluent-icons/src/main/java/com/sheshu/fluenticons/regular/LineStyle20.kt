package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineStyle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineStyle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 4.224f, 2.224f, 4f, 2.5f, 4f)
            horizontalLineToRelative(3f)
            curveTo(5.776f, 4f, 6f, 4.224f, 6f, 4.5f)
            reflectiveCurveTo(5.776f, 5f, 5.5f, 5f)
            horizontalLineToRelative(-3f)
            curveTo(2.224f, 5f, 2f, 4.776f, 2f, 4.5f)
            close()
            moveToRelative(6f, 0f)
            curveTo(8f, 4.224f, 8.224f, 4f, 8.5f, 4f)
            horizontalLineToRelative(3f)
            curveTo(11.776f, 4f, 12f, 4.224f, 12f, 4.5f)
            reflectiveCurveTo(11.776f, 5f, 11.5f, 5f)
            horizontalLineToRelative(-3f)
            curveTo(8.224f, 5f, 8f, 4.776f, 8f, 4.5f)
            close()
            moveToRelative(6f, 0f)
            curveTo(14f, 4.224f, 14.224f, 4f, 14.5f, 4f)
            horizontalLineToRelative(3f)
            curveTo(17.776f, 4f, 18f, 4.224f, 18f, 4.5f)
            reflectiveCurveTo(17.776f, 5f, 17.5f, 5f)
            horizontalLineToRelative(-3f)
            curveTo(14.224f, 5f, 14f, 4.776f, 14f, 4.5f)
            close()
            moveToRelative(-12f, 5f)
            curveTo(2f, 9.224f, 2.224f, 9f, 2.5f, 9f)
            horizontalLineToRelative(15f)
            curveTo(17.776f, 9f, 18f, 9.224f, 18f, 9.5f)
            reflectiveCurveTo(17.776f, 10f, 17.5f, 10f)
            horizontalLineToRelative(-15f)
            curveTo(2.224f, 10f, 2f, 9.776f, 2f, 9.5f)
            close()
            moveTo(3f, 14f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(14f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
