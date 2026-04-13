package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignBottom24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignBottom24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 21f)
            curveTo(2.336f, 21f, 2f, 20.664f, 2f, 20.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(18.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(21.664f, 21f, 21.25f, 21f)
            horizontalLineTo(2.75f)
            close()
            moveTo(4f, 15.75f)
            curveTo(4f, 16.993f, 5.007f, 18f, 6.25f, 18f)
            horizontalLineToRelative(2.5f)
            curveTo(9.993f, 18f, 11f, 16.993f, 11f, 15.75f)
            verticalLineTo(5.25f)
            curveTo(11f, 4.007f, 9.993f, 3f, 8.75f, 3f)
            horizontalLineToRelative(-2.5f)
            curveTo(5.007f, 3f, 4f, 4.007f, 4f, 5.25f)
            verticalLineToRelative(10.5f)
            close()
            moveToRelative(9f, 0f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            horizontalLineToRelative(2.5f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.243f, -1.007f, -2.25f, -2.25f, -2.25f)
            horizontalLineToRelative(-2.5f)
            curveTo(14.007f, 6.5f, 13f, 7.507f, 13f, 8.75f)
            verticalLineToRelative(7f)
            close()
        }
    }.build()
}
