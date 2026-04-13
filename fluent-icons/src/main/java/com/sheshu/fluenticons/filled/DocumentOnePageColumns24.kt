package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentOnePageColumns24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentOnePageColumns24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineToRelative(11.5f)
            curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(8.75f, 5f)
            curveTo(8.336f, 5f, 8f, 5.336f, 8f, 5.75f)
            verticalLineToRelative(12.5f)
            curveTo(8f, 18.664f, 8.336f, 19f, 8.75f, 19f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(5.75f)
            curveTo(9.5f, 5.336f, 9.164f, 5f, 8.75f, 5f)
            close()
            moveTo(16f, 5.75f)
            curveTo(16f, 5.336f, 15.664f, 5f, 15.25f, 5f)
            reflectiveCurveTo(14.5f, 5.336f, 14.5f, 5.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(16f, 18.664f, 16f, 18.25f)
            verticalLineTo(5.75f)
            close()
        }
    }.build()
}
