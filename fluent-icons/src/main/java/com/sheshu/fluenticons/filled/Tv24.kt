package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tv24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tv24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineToRelative(8.5f)
            curveTo(2f, 16.769f, 3.231f, 18f, 4.75f, 18f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-8.5f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(5f, 20.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(12.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(18.664f, 21f, 18.25f, 21f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 21f, 5f, 20.664f, 5f, 20.25f)
            close()
        }
    }.build()
}
