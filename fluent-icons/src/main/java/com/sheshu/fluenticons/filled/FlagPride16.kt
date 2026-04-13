package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagPride16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagPride16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color(0xFFE62C46))) {
            moveTo(2.75f, 2.75f)
            horizontalLineToRelative(10.5f)
            verticalLineToRelative(1.5f)
            horizontalLineTo(2.75f)
            verticalLineToRelative(-1.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF36D38))) {
            moveTo(2.75f, 4f)
            horizontalLineToRelative(10.5f)
            verticalLineToRelative(1.5f)
            horizontalLineTo(2.75f)
            verticalLineTo(4f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD23E))) {
            moveTo(2.75f, 5.25f)
            horizontalLineToRelative(10.5f)
            verticalLineTo(7f)
            horizontalLineTo(2.75f)
            verticalLineTo(5.25f)
            close()
        }
        path(fill = SolidColor(Color(0xFF61BC51))) {
            moveTo(2.75f, 6.5f)
            horizontalLineToRelative(10.5f)
            verticalLineToRelative(1.75f)
            horizontalLineTo(2.75f)
            verticalLineTo(6.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFF1793E8))) {
            moveTo(2.75f, 7.75f)
            horizontalLineToRelative(10.5f)
            verticalLineToRelative(1.5f)
            horizontalLineTo(2.75f)
            verticalLineToRelative(-1.5f)
            close()
        }
        path(fill = SolidColor(Color(0xFFB73FBB))) {
            moveTo(2.75f, 9f)
            horizontalLineToRelative(10.5f)
            verticalLineToRelative(1.25f)
            horizontalLineTo(2.75f)
            verticalLineTo(9f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 2f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 2f, 14f, 2.224f, 14f, 2.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(3f)
            verticalLineToRelative(2.5f)
            curveTo(3f, 13.776f, 2.776f, 14f, 2.5f, 14f)
            reflectiveCurveTo(2f, 13.776f, 2f, 13.5f)
            verticalLineToRelative(-11f)
            curveTo(2f, 2.224f, 2.224f, 2f, 2.5f, 2f)
            close()
            moveTo(3f, 3f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(10f)
            verticalLineTo(3f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
