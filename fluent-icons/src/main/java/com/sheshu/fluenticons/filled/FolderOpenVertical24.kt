package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FolderOpenVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderOpenVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21f, 5.25f)
            curveTo(21f, 3.455f, 19.545f, 2f, 17.75f, 2f)
            horizontalLineTo(8.84f)
            lineToRelative(3.54f, 2.045f)
            curveToRelative(1.316f, 0.759f, 2.126f, 2.162f, 2.126f, 3.68f)
            verticalLineTo(20f)
            horizontalLineToRelative(0.745f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineToRelative(-5.19f)
            lineToRelative(1.841f, -1.84f)
            curveToRelative(0.422f, -0.422f, 0.66f, -0.995f, 0.66f, -1.591f)
            verticalLineTo(5.25f)
            close()
            moveToRelative(-7.995f, 2.475f)
            verticalLineToRelative(13.02f)
            curveToRelative(0f, 1.732f, -1.875f, 2.814f, -3.375f, 1.948f)
            lineToRelative(-5.26f, -3.036f)
            curveToRelative(-0.85f, -0.491f, -1.375f, -1.4f, -1.375f, -2.382f)
            verticalLineTo(4.255f)
            curveToRelative(0f, -1.731f, 1.875f, -2.814f, 3.375f, -1.948f)
            lineToRelative(5.259f, 3.037f)
            curveToRelative(0.85f, 0.49f, 1.375f, 1.399f, 1.375f, 2.381f)
            close()
        }
    }.build()
}
