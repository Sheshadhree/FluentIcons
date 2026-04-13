package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookDefault28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookDefault28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 5.75f)
            curveToRelative(0f, -1.795f, 1.455f, -3.25f, 3.25f, -3.25f)
            horizontalLineToRelative(12.5f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(6.018f)
            curveTo(6.139f, 23.348f, 6.868f, 24f, 7.75f, 24f)
            horizontalLineToRelative(15f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-15f)
            curveToRelative(-1.795f, 0f, -3.25f, -1.455f, -3.25f, -3.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(8f, 7.25f)
            verticalLineToRelative(1f)
            curveTo(8f, 8.94f, 8.56f, 9.5f, 9.25f, 9.5f)
            horizontalLineToRelative(9.5f)
            curveTo(19.44f, 9.5f, 20f, 8.94f, 20f, 8.25f)
            verticalLineToRelative(-1f)
            curveTo(20f, 6.56f, 19.44f, 6f, 18.75f, 6f)
            horizontalLineToRelative(-9.5f)
            curveTo(8.56f, 6f, 8f, 6.56f, 8f, 7.25f)
            close()
        }
    }.build()
}
