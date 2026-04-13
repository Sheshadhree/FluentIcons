package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagPride32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagPride32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color(0xFFB73FBB))) {
            moveTo(5f, 16f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(3.5f)
            horizontalLineTo(5f)
            verticalLineTo(16f)
            close()
        }
        path(fill = SolidColor(Color(0xFF1793E8))) {
            moveTo(5f, 13f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(4f)
            horizontalLineTo(5f)
            verticalLineToRelative(-4f)
            close()
        }
        path(fill = SolidColor(Color(0xFF61BC51))) {
            moveTo(5f, 11f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(3f)
            horizontalLineTo(5f)
            verticalLineToRelative(-3f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD23E))) {
            moveTo(5f, 9f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(3f)
            horizontalLineTo(5f)
            verticalLineTo(9f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF36D38))) {
            moveTo(5f, 6f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(4f)
            horizontalLineTo(5f)
            verticalLineTo(6f)
            close()
        }
        path(fill = SolidColor(Color(0xFFE62C46))) {
            moveTo(5f, 4f)
            horizontalLineToRelative(22f)
            verticalLineToRelative(3f)
            horizontalLineTo(5f)
            verticalLineTo(4f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(22f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(6f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineTo(4f)
            close()
            moveToRelative(2f, 15f)
            horizontalLineToRelative(20f)
            verticalLineTo(5f)
            horizontalLineTo(6f)
            verticalLineToRelative(14f)
            close()
        }
    }.build()
}
