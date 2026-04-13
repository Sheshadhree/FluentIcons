package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineHorizontal1Dashes16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineHorizontal1Dashes16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.5f)
            curveTo(2f, 7.224f, 2.224f, 7f, 2.5f, 7f)
            horizontalLineToRelative(2f)
            curveTo(4.776f, 7f, 5f, 7.224f, 5f, 7.5f)
            reflectiveCurveTo(4.776f, 8f, 4.5f, 8f)
            horizontalLineToRelative(-2f)
            curveTo(2.224f, 8f, 2f, 7.776f, 2f, 7.5f)
            close()
            moveToRelative(4.5f, 0f)
            curveTo(6.5f, 7.224f, 6.724f, 7f, 7f, 7f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.276f, 8f, 9f, 8f)
            horizontalLineTo(7f)
            curveTo(6.724f, 8f, 6.5f, 7.776f, 6.5f, 7.5f)
            close()
            moveToRelative(4.5f, 0f)
            curveTo(11f, 7.224f, 11.224f, 7f, 11.5f, 7f)
            horizontalLineToRelative(2f)
            curveTo(13.776f, 7f, 14f, 7.224f, 14f, 7.5f)
            reflectiveCurveTo(13.776f, 8f, 13.5f, 8f)
            horizontalLineToRelative(-2f)
            curveTo(11.224f, 8f, 11f, 7.776f, 11f, 7.5f)
            close()
        }
    }.build()
}
