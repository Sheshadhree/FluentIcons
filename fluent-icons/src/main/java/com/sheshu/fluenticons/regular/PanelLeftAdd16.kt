package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PanelLeftAdd16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PanelLeftAdd16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 4.5f)
            curveTo(1f, 3.12f, 2.12f, 2f, 3.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(11.88f, 2f, 13f, 3.12f, 13f, 4.5f)
            verticalLineToRelative(1.707f)
            curveToRelative(-0.322f, -0.091f, -0.657f, -0.154f, -1f, -0.185f)
            verticalLineTo(4.5f)
            curveTo(12f, 3.672f, 11.328f, 3f, 10.5f, 3f)
            horizontalLineTo(6f)
            verticalLineToRelative(8f)
            horizontalLineToRelative(0.022f)
            curveTo(6.008f, 11.165f, 6f, 11.332f, 6f, 11.5f)
            curveToRelative(0f, 0.168f, 0.008f, 0.335f, 0.022f, 0.5f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 12f, 1f, 10.88f, 1f, 9.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(5f, 3f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 10.328f, 2.672f, 11f, 3.5f, 11f)
            horizontalLineTo(5f)
            verticalLineTo(3f)
            close()
            moveToRelative(11f, 8.5f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveTo(7f, 13.985f, 7f, 11.5f)
            reflectiveCurveTo(9.015f, 7f, 11.5f, 7f)
            reflectiveCurveTo(16f, 9.015f, 16f, 11.5f)
            close()
            moveToRelative(-4f, -2f)
            curveTo(12f, 9.224f, 11.776f, 9f, 11.5f, 9f)
            reflectiveCurveTo(11f, 9.224f, 11f, 9.5f)
            verticalLineTo(11f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 11f, 9f, 11.224f, 9f, 11.5f)
            reflectiveCurveTo(9.224f, 12f, 9.5f, 12f)
            horizontalLineTo(11f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 11f, 13.5f, 11f)
            horizontalLineTo(12f)
            verticalLineTo(9.5f)
            close()
        }
    }.build()
}
