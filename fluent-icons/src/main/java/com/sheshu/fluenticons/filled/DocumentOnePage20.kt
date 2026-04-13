package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentOnePage20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentOnePage20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
            moveToRelative(1.5f, 4f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 6f, 13f, 6.224f, 13f, 6.5f)
            reflectiveCurveTo(12.776f, 7f, 12.5f, 7f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 7f, 7f, 6.776f, 7f, 6.5f)
            reflectiveCurveTo(7.224f, 6f, 7.5f, 6f)
            close()
            moveTo(7f, 13.5f)
            curveTo(7f, 13.224f, 7.224f, 13f, 7.5f, 13f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 14f, 12.5f, 14f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 14f, 7f, 13.776f, 7f, 13.5f)
            close()
            moveToRelative(0.5f, -4f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 10.5f, 7f, 10.276f, 7f, 10f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
