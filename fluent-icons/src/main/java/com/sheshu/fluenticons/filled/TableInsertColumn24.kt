package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableInsertColumn24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableInsertColumn24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3.75f)
            verticalLineToRelative(16.5f)
            curveTo(4.5f, 20.664f, 4.164f, 21f, 3.75f, 21f)
            reflectiveCurveTo(3f, 20.664f, 3f, 20.25f)
            verticalLineTo(3.75f)
            curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
            reflectiveCurveTo(4.5f, 3.336f, 4.5f, 3.75f)
            close()
            moveTo(16f, 5.25f)
            curveTo(16f, 4.007f, 15.105f, 3f, 14f, 3f)
            horizontalLineToRelative(-4f)
            curveTo(8.895f, 3f, 8f, 4.007f, 8f, 5.25f)
            verticalLineTo(8f)
            horizontalLineToRelative(8f)
            verticalLineTo(5.25f)
            close()
            moveTo(8f, 14.5f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(5f)
            horizontalLineTo(8f)
            close()
            moveTo(8f, 16f)
            verticalLineToRelative(2.75f)
            curveTo(8f, 19.993f, 8.895f, 21f, 10f, 21f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, -1.007f, 2f, -2.25f)
            verticalLineTo(16f)
            horizontalLineTo(8f)
            close()
            moveToRelative(13f, 4.25f)
            verticalLineTo(3.75f)
            curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
            reflectiveCurveTo(19.5f, 3.336f, 19.5f, 3.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(21f, 20.664f, 21f, 20.25f)
            close()
        }
    }.build()
}
