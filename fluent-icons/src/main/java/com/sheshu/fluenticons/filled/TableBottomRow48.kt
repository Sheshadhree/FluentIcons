package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableBottomRow48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableBottomRow48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(42f, 12.25f)
            curveTo(42f, 8.798f, 39.202f, 6f, 35.75f, 6f)
            horizontalLineToRelative(-23.5f)
            curveTo(8.798f, 6f, 6f, 8.798f, 6f, 12.25f)
            verticalLineTo(29f)
            horizontalLineToRelative(2.5f)
            verticalLineTo(12.25f)
            curveToRelative(0f, -2.071f, 1.679f, -3.75f, 3.75f, -3.75f)
            horizontalLineToRelative(23.5f)
            curveToRelative(2.071f, 0f, 3.75f, 1.679f, 3.75f, 3.75f)
            verticalLineTo(29f)
            horizontalLineTo(42f)
            verticalLineTo(12.25f)
            close()
            moveTo(8.5f, 40.75f)
            curveToRelative(-1.518f, -1.14f, -2.5f, -2.955f, -2.5f, -5f)
            verticalLineTo(31.5f)
            horizontalLineToRelative(10.5f)
            verticalLineTo(42f)
            horizontalLineToRelative(-4.25f)
            curveToRelative(-1.407f, 0f, -2.705f, -0.465f, -3.75f, -1.25f)
            close()
            moveTo(42f, 31.5f)
            horizontalLineTo(31.5f)
            verticalLineTo(42f)
            horizontalLineToRelative(4.25f)
            curveToRelative(1.407f, 0f, 2.705f, -0.465f, 3.75f, -1.25f)
            curveToRelative(1.518f, -1.14f, 2.5f, -2.955f, 2.5f, -5f)
            verticalLineTo(31.5f)
            close()
            moveTo(29f, 42f)
            horizontalLineTo(19f)
            verticalLineTo(31.5f)
            horizontalLineToRelative(10f)
            verticalLineTo(42f)
            close()
        }
    }.build()
}
