package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Mailbox16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Mailbox16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 1.5f)
            curveTo(2f, 1.224f, 2.224f, 1f, 2.5f, 1f)
            horizontalLineToRelative(3f)
            curveTo(5.776f, 1f, 6f, 1.224f, 6f, 1.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(6f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(2f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(1f)
            verticalLineTo(4f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 4f, 2f, 3.776f, 2f, 3.5f)
            verticalLineToRelative(-2f)
            close()
            moveToRelative(3f, 8f)
            verticalLineTo(7f)
            horizontalLineTo(4f)
            curveTo(2.895f, 7f, 2f, 7.895f, 2f, 9f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(7f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.768f, 0.289f, -1.47f, 0.764f, -2f)
            horizontalLineTo(6f)
            verticalLineToRelative(2.5f)
            curveTo(6f, 9.776f, 5.776f, 10f, 5.5f, 10f)
            reflectiveCurveTo(5f, 9.776f, 5f, 9.5f)
            close()
            moveTo(14f, 9f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(4f)
            verticalLineTo(9f)
            close()
            moveToRelative(-2.5f, 0f)
            curveTo(11.224f, 9f, 11f, 9.224f, 11f, 9.5f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 9f, 12.5f, 9f)
            horizontalLineToRelative(-1f)
            close()
        }
    }.build()
}
