package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Mailbox20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Mailbox20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(3.224f, 2f, 3f, 2.224f, 3f, 2.5f)
            verticalLineToRelative(2f)
            curveTo(3f, 4.776f, 3.224f, 5f, 3.5f, 5f)
            horizontalLineTo(7f)
            verticalLineToRelative(3f)
            horizontalLineTo(5.5f)
            curveTo(3.567f, 8f, 2f, 9.567f, 2f, 11.5f)
            verticalLineTo(17f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(14f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-5.5f)
            curveTo(18f, 9.567f, 16.433f, 8f, 14.5f, 8f)
            horizontalLineTo(8f)
            verticalLineTo(2.5f)
            curveTo(8f, 2.224f, 7.776f, 2f, 7.5f, 2f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(7f, 9f)
            verticalLineToRelative(2.5f)
            curveTo(7f, 11.776f, 7.224f, 12f, 7.5f, 12f)
            reflectiveCurveTo(8f, 11.776f, 8f, 11.5f)
            verticalLineTo(9f)
            horizontalLineToRelative(4.05f)
            curveTo(11.402f, 9.635f, 11f, 10.52f, 11f, 11.5f)
            verticalLineTo(17f)
            horizontalLineTo(3f)
            verticalLineToRelative(-5.5f)
            curveTo(3f, 10.12f, 4.12f, 9f, 5.5f, 9f)
            horizontalLineTo(7f)
            close()
            moveToRelative(10f, 2.5f)
            verticalLineTo(17f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(14f, 11f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(13.724f, 12f, 14f, 12f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(15.276f, 11f, 15f, 11f)
            horizontalLineToRelative(-1f)
            close()
        }
    }.build()
}
