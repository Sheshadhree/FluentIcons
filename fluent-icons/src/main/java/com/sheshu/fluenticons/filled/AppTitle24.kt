package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AppTitle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AppTitle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 20.5f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(19.25f, 22f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 22f, 4f, 21.664f, 4f, 21.25f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(4.75f, 20.5f)
            horizontalLineToRelative(14.5f)
            horizontalLineToRelative(-14.5f)
            close()
            moveTo(16.25f, 3f)
            curveTo(18.321f, 3f, 20f, 4.679f, 20f, 6.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(5.679f, 19f, 4f, 17.321f, 4f, 15.25f)
            verticalLineToRelative(-8.5f)
            curveTo(4f, 4.679f, 5.679f, 3f, 7.75f, 3f)
            horizontalLineToRelative(8.5f)
            close()
        }
    }.build()
}
