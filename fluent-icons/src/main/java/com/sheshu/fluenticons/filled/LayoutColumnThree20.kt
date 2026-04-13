package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutColumnThree20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutColumnThree20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 17f)
            horizontalLineToRelative(1f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(14f)
            close()
            moveTo(12f, 3f)
            horizontalLineTo(8f)
            verticalLineToRelative(14f)
            horizontalLineToRelative(4f)
            verticalLineTo(3f)
            close()
            moveTo(6f, 3f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(14f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            close()
        }
    }.build()
}
