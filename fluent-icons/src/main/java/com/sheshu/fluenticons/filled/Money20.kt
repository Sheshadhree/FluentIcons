package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Money20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Money20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 4f)
            curveTo(2.672f, 4f, 2f, 4.672f, 2f, 5.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveTo(16f, 4.672f, 15.328f, 4f, 14.5f, 4f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(6f, 5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(3f)
            verticalLineTo(7f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(5f)
            horizontalLineToRelative(1f)
            close()
            moveToRelative(3f, 5.75f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            reflectiveCurveTo(8.034f, 7.25f, 9f, 7.25f)
            reflectiveCurveTo(10.75f, 8.034f, 10.75f, 9f)
            reflectiveCurveTo(9.966f, 10.75f, 9f, 10.75f)
            close()
            moveTo(3f, 11f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(1f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1f)
            horizontalLineTo(5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(3f)
            close()
            moveToRelative(11f, 0f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-1f)
            close()
            moveToRelative(0f, -4f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            close()
            moveToRelative(3f, 5.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(4.085f)
            curveToRelative(0.206f, 0.583f, 0.762f, 1f, 1.415f, 1f)
            horizontalLineToRelative(9f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.653f, -0.417f, -1.209f, -1f, -1.415f)
            verticalLineTo(12.5f)
            close()
        }
    }.build()
}
