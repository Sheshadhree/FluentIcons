package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Beaker32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Beaker32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 5f)
            verticalLineToRelative(8.438f)
            curveToRelative(0f, 0.814f, -0.248f, 1.608f, -0.712f, 2.277f)
            lineTo(9.706f, 18f)
            horizontalLineToRelative(12.587f)
            lineToRelative(-1.582f, -2.285f)
            curveTo(20.248f, 15.046f, 20f, 14.252f, 20f, 13.438f)
            verticalLineTo(5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(11f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1f)
            close()
            moveToRelative(11.677f, 15f)
            horizontalLineTo(8.322f)
            lineToRelative(-2.744f, 3.963f)
            curveTo(4.104f, 26.092f, 5.628f, 29f, 8.218f, 29f)
            horizontalLineToRelative(15.564f)
            curveToRelative(2.589f, 0f, 4.113f, -2.908f, 2.639f, -5.037f)
            lineTo(23.677f, 20f)
            close()
        }
    }.build()
}
