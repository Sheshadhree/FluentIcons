package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Flow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Flow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.05f, 6f)
            horizontalLineTo(9.5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(5.95f)
            curveToRelative(-0.232f, 1.141f, -1.24f, 2f, -2.45f, 2f)
            curveTo(2.12f, 13f, 1f, 11.88f, 1f, 10.5f)
            reflectiveCurveTo(2.12f, 8f, 3.5f, 8f)
            curveToRelative(1.21f, 0f, 2.218f, 0.859f, 2.45f, 2f)
            horizontalLineTo(6.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(0.55f)
            curveToRelative(0.232f, -1.141f, 1.24f, -2f, 2.45f, -2f)
            curveTo(13.88f, 3f, 15f, 4.12f, 15f, 5.5f)
            reflectiveCurveTo(13.88f, 8f, 12.5f, 8f)
            curveToRelative(-1.21f, 0f, -2.218f, -0.859f, -2.45f, -2f)
            close()
        }
    }.build()
}
