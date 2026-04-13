package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal116: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal116",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 7.75f)
            curveTo(2f, 7.336f, 2.336f, 7f, 2.75f, 7f)
            horizontalLineToRelative(10.5f)
            curveTo(13.664f, 7f, 14f, 7.336f, 14f, 7.75f)
            reflectiveCurveTo(13.664f, 8.5f, 13.25f, 8.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 8.5f, 2f, 8.164f, 2f, 7.75f)
            close()
        }
    }.build()
}
