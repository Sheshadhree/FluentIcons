package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(3.67f, 3.668f)
            curveTo(5.568f, 7.05f, 5.413f, 7.633f, 5.352f, 8.246f)
            horizontalLineToRelative(-0.07f)
            curveTo(3.468f, 8.246f, 2f, 9.758f, 2f, 11.623f)
            curveTo(2f, 13.488f, 3.47f, 15f, 5.282f, 15f)
            horizontalLineToRelative(9.01f)
            lineToRelative(2.854f, 2.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveTo(18f, 11.623f)
            curveToRelative(0f, 1.168f, -0.576f, 2.197f, -1.452f, 2.804f)
            lineToRelative(-9.49f, -9.49f)
            curveTo(7.808f, 4.352f, 8.792f, 4f, 10f, 4f)
            curveToRelative(2.817f, 0f, 4.415f, 1.923f, 4.647f, 4.246f)
            horizontalLineToRelative(0.07f)
            curveToRelative(1.814f, 0f, 3.283f, 1.512f, 3.283f, 3.377f)
            close()
        }
    }.build()
}
