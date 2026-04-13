package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FolderOpenDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderOpenDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 21.004f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            verticalLineTo(8.843f)
            lineToRelative(2.045f, 3.54f)
            curveToRelative(0.759f, 1.316f, 2.162f, 2.126f, 3.68f, 2.126f)
            horizontalLineTo(20f)
            verticalLineToRelative(0.745f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineToRelative(-5.19f)
            lineToRelative(-1.84f, 1.841f)
            curveToRelative(-0.422f, 0.422f, -0.995f, 0.66f, -1.591f, 0.66f)
            horizontalLineTo(5.25f)
            close()
            moveToRelative(2.475f, -7.995f)
            horizontalLineToRelative(13.02f)
            curveToRelative(1.732f, 0f, 2.814f, -1.875f, 1.948f, -3.375f)
            lineToRelative(-3.036f, -5.259f)
            curveTo(19.166f, 3.525f, 18.257f, 3f, 17.275f, 3f)
            horizontalLineTo(4.255f)
            curveToRelative(-1.73f, 0f, -2.813f, 1.875f, -1.947f, 3.375f)
            lineToRelative(3.037f, 5.259f)
            curveToRelative(0.49f, 0.85f, 1.399f, 1.375f, 2.381f, 1.375f)
            close()
        }
    }.build()
}
