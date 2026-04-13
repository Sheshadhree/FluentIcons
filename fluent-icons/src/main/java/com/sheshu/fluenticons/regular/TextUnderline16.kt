package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextUnderline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextUnderline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(4.776f, 2f, 5f, 2.224f, 5f, 2.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 1.624f, 1.376f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.376f, 3f, -3f)
            verticalLineTo(2.5f)
            curveTo(11f, 2.224f, 11.224f, 2f, 11.5f, 2f)
            reflectiveCurveTo(12f, 2.224f, 12f, 2.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 2.176f, -1.824f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.824f, -4f, -4f)
            verticalLineTo(2.5f)
            curveTo(4f, 2.224f, 4.224f, 2f, 4.5f, 2f)
            close()
            moveTo(4f, 13.5f)
            curveTo(4f, 13.224f, 4.224f, 13f, 4.5f, 13f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(11.776f, 14f, 11.5f, 14f)
            horizontalLineToRelative(-7f)
            curveTo(4.224f, 14f, 4f, 13.776f, 4f, 13.5f)
            close()
        }
    }.build()
}
