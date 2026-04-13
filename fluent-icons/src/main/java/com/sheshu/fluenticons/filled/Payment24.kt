package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Payment24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Payment24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 5f)
            curveTo(3.455f, 5f, 2f, 6.455f, 2f, 8.25f)
            verticalLineTo(9.5f)
            horizontalLineToRelative(20f)
            verticalLineTo(8.25f)
            curveTo(22f, 6.455f, 20.545f, 5f, 18.75f, 5f)
            horizontalLineTo(5.25f)
            close()
            moveTo(22f, 11f)
            horizontalLineTo(2f)
            verticalLineToRelative(4.75f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineToRelative(13.5f)
            curveToRelative(1.795f, 0f, 3.25f, -1.455f, 3.25f, -3.25f)
            verticalLineTo(11f)
            close()
            moveToRelative(-6.25f, 3.5f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(18.664f, 16f, 18.25f, 16f)
            horizontalLineToRelative(-2.5f)
            curveTo(15.336f, 16f, 15f, 15.664f, 15f, 15.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            close()
        }
    }.build()
}
