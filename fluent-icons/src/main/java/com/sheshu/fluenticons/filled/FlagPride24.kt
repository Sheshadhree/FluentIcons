package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagPride24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagPride24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFFE62C46))) {
            moveTo(4f, 4f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(2.5f)
            horizontalLineTo(4f)
            verticalLineTo(4f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF36D38))) {
            moveTo(4f, 6f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(2.5f)
            horizontalLineTo(4f)
            verticalLineTo(6f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD23E))) {
            moveTo(4f, 8f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(2.5f)
            horizontalLineTo(4f)
            verticalLineTo(8f)
            close()
        }
        path(fill = SolidColor(Color(0xFF61BC51))) {
            moveTo(4f, 10f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(2.5f)
            horizontalLineTo(4f)
            verticalLineTo(10f)
            close()
        }
        path(fill = SolidColor(Color(0xFF1793E8))) {
            moveTo(4f, 12f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(2f)
            horizontalLineTo(4f)
            verticalLineToRelative(-2f)
            close()
        }
        path(fill = SolidColor(Color(0xFFB73FBB))) {
            moveTo(4f, 13.5f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(1.75f)
            horizontalLineTo(4f)
            verticalLineTo(13.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 3f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            verticalLineToRelative(17.5f)
            curveTo(3f, 21.664f, 3.336f, 22f, 3.75f, 22f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(16.5f)
            horizontalLineToRelative(15.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-12f)
            curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
            horizontalLineTo(3.75f)
            close()
            moveTo(4.5f, 4.5f)
            horizontalLineToRelative(15f)
            verticalLineTo(15f)
            horizontalLineToRelative(-15f)
            verticalLineTo(4.5f)
            close()
        }
    }.build()
}
