package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FolderOpen24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FolderOpen24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 3f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineToRelative(8.912f)
            lineToRelative(2.045f, -3.541f)
            curveToRelative(0.759f, -1.315f, 2.162f, -2.125f, 3.68f, -2.125f)
            horizontalLineTo(20f)
            verticalLineTo(8.75f)
            curveToRelative(0f, -1.795f, -1.455f, -3.25f, -3.25f, -3.25f)
            horizontalLineToRelative(-5.19f)
            lineTo(9.72f, 3.659f)
            curveTo(9.298f, 3.237f, 8.725f, 3f, 8.129f, 3f)
            horizontalLineTo(5.25f)
            close()
            moveToRelative(2.475f, 7.996f)
            horizontalLineToRelative(13.02f)
            curveToRelative(1.732f, 0f, 2.814f, 1.875f, 1.948f, 3.375f)
            lineToRelative(-3.036f, 5.258f)
            curveToRelative(-0.491f, 0.851f, -1.4f, 1.375f, -2.382f, 1.375f)
            horizontalLineTo(4.255f)
            curveToRelative(-1.731f, 0f, -2.814f, -1.875f, -1.948f, -3.375f)
            lineToRelative(3.037f, -5.258f)
            curveToRelative(0.49f, -0.851f, 1.399f, -1.375f, 2.381f, -1.375f)
            close()
        }
    }.build()
}
