package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Phone32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Phone32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.25f, 2f)
            curveTo(8.455f, 2f, 7f, 3.455f, 7f, 5.25f)
            verticalLineToRelative(21.5f)
            curveTo(7f, 28.545f, 8.455f, 30f, 10.25f, 30f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(5.25f)
            curveTo(25f, 3.455f, 23.545f, 2f, 21.75f, 2f)
            horizontalLineToRelative(-11.5f)
            close()
            moveTo(9f, 5.25f)
            curveTo(9f, 4.56f, 9.56f, 4f, 10.25f, 4f)
            horizontalLineToRelative(11.5f)
            curveTo(22.44f, 4f, 23f, 4.56f, 23f, 5.25f)
            verticalLineToRelative(21.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-11.5f)
            curveTo(9.56f, 28f, 9f, 27.44f, 9f, 26.75f)
            verticalLineTo(5.25f)
            close()
            moveTo(14f, 24f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
