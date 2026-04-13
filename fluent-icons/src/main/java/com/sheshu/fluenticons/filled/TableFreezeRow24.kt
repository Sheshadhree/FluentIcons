package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableFreezeRow24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableFreezeRow24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineToRelative(8.25f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-5f)
            horizontalLineTo(4.5f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineTo(9.5f)
            horizontalLineTo(16f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(21f, 16f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(1.75f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(16f)
            close()
            moveToRelative(-6.5f, -1.5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(5f)
            close()
            moveToRelative(-5f, 1.5f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(8f, 16f)
            horizontalLineTo(3f)
            verticalLineToRelative(1.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(8f)
            verticalLineToRelative(-5f)
            close()
        }
    }.build()
}
