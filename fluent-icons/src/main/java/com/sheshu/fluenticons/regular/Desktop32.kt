package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Desktop32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Desktop32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 3f)
            curveTo(3.455f, 3f, 2f, 4.455f, 2f, 6.25f)
            verticalLineToRelative(15.5f)
            curveTo(2f, 23.545f, 3.455f, 25f, 5.25f, 25f)
            horizontalLineToRelative(6.76f)
            verticalLineToRelative(2.001f)
            horizontalLineTo(9.012f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveTo(8.46f, 29f, 9.012f, 29f)
            horizontalLineToRelative(13.992f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            curveToRelative(0f, -0.551f, -0.448f, -0.999f, -1f, -0.999f)
            horizontalLineToRelative(-2.998f)
            verticalLineTo(25f)
            horizontalLineToRelative(6.744f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(6.25f)
            curveTo(30f, 4.455f, 28.545f, 3f, 26.75f, 3f)
            horizontalLineTo(5.25f)
            close()
            moveToRelative(12.756f, 22f)
            verticalLineToRelative(2.001f)
            horizontalLineTo(14.01f)
            verticalLineTo(25f)
            horizontalLineToRelative(3.996f)
            close()
            moveTo(4f, 6.25f)
            curveTo(4f, 5.56f, 4.56f, 5f, 5.25f, 5f)
            horizontalLineToRelative(21.5f)
            curveTo(27.44f, 5f, 28f, 5.56f, 28f, 6.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 23f, 4f, 22.44f, 4f, 21.75f)
            verticalLineTo(6.25f)
            close()
        }
    }.build()
}
