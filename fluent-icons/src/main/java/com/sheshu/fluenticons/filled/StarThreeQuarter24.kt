package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.StarThreeQuarter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarThreeQuarter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 6.727f)
            lineToRelative(-1.789f, -3.625f)
            curveTo(12.963f, 2.6f, 12.481f, 2.35f, 11.999f, 2.35f)
            curveToRelative(-0.481f, 0f, -0.963f, 0.25f, -1.211f, 0.752f)
            lineTo(8.43f, 7.88f)
            lineTo(3.157f, 8.646f)
            curveToRelative(-1.107f, 0.16f, -1.55f, 1.522f, -0.748f, 2.303f)
            lineToRelative(3.815f, 3.719f)
            lineToRelative(-0.9f, 5.25f)
            curveToRelative(-0.15f, 0.874f, 0.544f, 1.583f, 1.331f, 1.582f)
            curveToRelative(0.208f, 0f, 0.422f, -0.05f, 0.63f, -0.158f)
            lineToRelative(4.714f, -2.479f)
            lineTo(15f, 20.441f)
            verticalLineTo(6.727f)
            close()
        }
    }.build()
}
